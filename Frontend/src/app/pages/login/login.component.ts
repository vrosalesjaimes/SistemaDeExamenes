import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginData ={
    "username": '',
    "password": ''
  }

  constructor(private snack:MatSnackBar, private loginService:LoginService,
              private router:Router){

  }

  ngOnInit(): void {

  }

  formSubmit(){
    if(this.loginData.username.trim() == "" || this.loginData.username == null){
      this.snack.open("El nombre de usuario es requerido","Aceptar", {
        duration:3000
      })
      return;
    }

    if(this.loginData.password.trim() == "" || this.loginData.password == null){
      this.snack.open("La contraseña es requerida","Aceptar", {
        duration:3000
      })
      return;
    }

    this.loginService.generateToken(this.loginData).subscribe({
      next: (dato:any) => {
        console.log(dato);
        this.loginService.loginUser(dato.token);
        this.loginService.getCurrentUser().subscribe({
          next: (user:any) =>{
            this.loginService.setUser(user);
            console.log(user);
            if(this.loginService.getUserRol() == "ADMIN"){
              this.router.navigate(['/admin']);
            }
            else if(this.loginService.getUserRol() == "NORMAL"){
              this.router.navigate(['/user']);
            }else{
              this.loginService.logOut();
            }
          }
        })
      },
      error: (error:any) =>{
        console.log(error);
        this.snack.open("Detalles inválidos, vuelva a intentar", "Aceptar", {
          duration: 3000
        });
      }
    })
  }

}
