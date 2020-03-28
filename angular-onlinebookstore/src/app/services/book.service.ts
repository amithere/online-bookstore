import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Book } from '../common/book';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators'

@Injectable({
  providedIn: 'root'
})
export class BookService {

  private baseUrl: string = "http://localhost:8082/api/v1/books";

  constructor(private http: HttpClient) {
  }

  public getBooks(): Observable<Book[]> {
    return this.http.get<GetResponseBooks>(this.baseUrl).pipe(
      map(response => response._embedded.books)
    ); 
  }

}

interface GetResponseBooks {
  _embedded: {
    books: Book[];
  }
} 