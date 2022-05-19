import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

// CHANGE TO HEROKU
const baseUrl = 'http://localhost:8080';

@Injectable({
  providedIn: 'root'
})
export class TransactionService {

  constructor(private http: HttpClient) { }
  
  list(): Observable<any> {
    return this.http.get(`${baseUrl}/transaction`);
  }

  findByIdAcc(idAcc:any): Observable<any> {
    return this.http.get(`${baseUrl}/transaction/${idAcc}`);
  }

  // adicionando o método de inclusão (POST) via API
  create(transactions:any): Observable<any> {
    return this.http.post(`${baseUrl}/transaction`,transactions);
  }

}