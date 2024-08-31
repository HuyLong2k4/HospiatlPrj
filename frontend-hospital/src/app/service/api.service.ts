import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
    providedIn: 'root',
})
export class ApiService {
    private apiUrl = 'https://localhost:8443/hospital/patients';

    constructor(private http: HttpClient) {}

    getData(headers?: HttpHeaders): Observable<any> {
        return this.http.get(this.apiUrl, {
            headers: headers,
            observe: 'response',
        });
    }
}
