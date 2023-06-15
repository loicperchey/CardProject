import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FleshAndBloodDeckComponent } from './flesh-and-blood-deck.component';

describe('FleshAndBloodDeckComponent', () => {
  let component: FleshAndBloodDeckComponent;
  let fixture: ComponentFixture<FleshAndBloodDeckComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FleshAndBloodDeckComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FleshAndBloodDeckComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
