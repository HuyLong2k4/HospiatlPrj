import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SetOrderComponent } from './set-order.component';

describe('SetOrderComponent', () => {
  let component: SetOrderComponent;
  let fixture: ComponentFixture<SetOrderComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SetOrderComponent]
    });
    fixture = TestBed.createComponent(SetOrderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
