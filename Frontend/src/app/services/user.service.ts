import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import BASEURL from './helper';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private httpClient:HttpClient) { }

  public anadirUsuario(user:any){
    return this.httpClient.post(`${BASEURL}/usuarios/`, user);
  }


}
