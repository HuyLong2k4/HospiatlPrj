import { Component } from '@angular/core';
import { ApiService } from 'src/app/service/api.service';

@Component({
    selector: 'app-header',
    templateUrl: './header.component.html',
    styleUrls: ['./header.component.scss'],
})
export class HeaderComponent {
    constructor(private apiService: ApiService) {}

    demo() {
        console.log('hfhfhfh');
        this.apiService.getData().subscribe((rep) => {
            console.log(123);
        });
    }
}
