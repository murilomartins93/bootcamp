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
    return this.http.get(`${baseUrl}/transactions`);
  }

  // adicionando o método de inclusão (POST) via API
  create(transactions:any): Observable<any> {
    return this.http.post(`${baseUrl}/transactions`,transactions);
  }

  findByIdAcc(idAcc:any): Observable<any> {
    return this.http.get(`${baseUrl}/transactions/${idAcc}`);
  }

}
