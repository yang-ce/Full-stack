import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {environment} from '../../environments/environment';

var username = 'cloudsimpleservice';
var password = 'mysecret';
const httpOptions = {
  headers: new HttpHeaders({ 'Authorization': "Basic " + btoa(username + ':' + password) })
};

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  public get currentUserToken(): string {
    return sessionStorage.getItem('token');
  }

  postSignIn(user,username2,password2) {
    
    // return this.http.post(`${environment.baseUrl}/api/cloud-auth-service/auth/oauth/token?grant_type=password&scope=webclient&username=yangce&password=123456`, JSON.stringify(user), httpOptions);
    return this.http.post(`${environment.baseUrl}/api/cloud-auth-service/auth/oauth/token?grant_type=password&scope=webclient&username=${username2}&password=${password2}`, JSON.stringify(user), httpOptions);
  }

}
