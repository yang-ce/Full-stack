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

  postSignIn(user) {
    return this.http.post(`${environment.baseUrl}/api/cloud-auth-service/auth/oauth/token?grant_type=password&scope=webclient&username=admin&password=admin`, JSON.stringify(user), httpOptions);
  }

}
