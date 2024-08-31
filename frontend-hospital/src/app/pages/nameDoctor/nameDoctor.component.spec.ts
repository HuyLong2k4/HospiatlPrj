import { ComponentFixture, TestBed } from '@angular/core/testing';

import { nameDoctorComponent } from './nameDoctor.component';

describe('nameDoctorComponent', () => {
  let component: nameDoctorComponent;
  let fixture: ComponentFixture<nameDoctorComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [nameDoctorComponent]
    });
    fixture = TestBed.createComponent(nameDoctorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
