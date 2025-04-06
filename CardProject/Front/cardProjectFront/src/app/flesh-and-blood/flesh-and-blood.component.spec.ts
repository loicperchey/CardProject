import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FleshAndBloodComponent } from './flesh-and-blood.component';

describe('FleshAndBloodComponent', () => {
  let component: FleshAndBloodComponent;
  let fixture: ComponentFixture<FleshAndBloodComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [FleshAndBloodComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FleshAndBloodComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
