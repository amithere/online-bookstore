import { Component, OnInit } from '@angular/core';
import { Book } from './common/book';
import { BookService } from './services/book.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  public books: Book[];
  public title: string;

  constructor(private bookService: BookService) {
  }

  ngOnInit() {
    this.getListOFBooks();
  }

  public getListOFBooks() {
    this.bookService.getBooks().subscribe(
      data => {
        this.books = data;
      }
    );
  }

}
