import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeckFleshAndBloodComponent } from './deck-flesh-and-blood.component';

describe('DeckFleshAndBloodComponent', () => {
  let component: DeckFleshAndBloodComponent;
  let fixture: ComponentFixture<DeckFleshAndBloodComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [DeckFleshAndBloodComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DeckFleshAndBloodComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
