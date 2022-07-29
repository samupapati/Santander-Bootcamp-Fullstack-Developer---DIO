import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http' 
import { Book } from './model/books.model';
import { Observable, throwError } from 'rxjs';
import { catchError, map, retry } from 'rxjs/operators';

@Injectable()

export class BookService{
    private url = 'https://localhost:44382/api/bookstore';

    httpOptions = {
        headers: new HttpHeaders({'Content-Type':'application/json'}) 
    }

    constructor(private http:HttpClient) {}

    getBooks(){
        return this.http.get(this.url)
    }
}