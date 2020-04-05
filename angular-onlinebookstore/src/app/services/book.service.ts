import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Book } from '../common/book';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  private baseUrl = 'http://localhost:8083/book';

  constructor(private http: HttpClient) {
  }

  public getBooks(): Observable<Book[]> {
    return this.http.get<Book[]>(this.baseUrl);
  }

}