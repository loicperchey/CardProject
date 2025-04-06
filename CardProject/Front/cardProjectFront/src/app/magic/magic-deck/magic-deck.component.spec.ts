import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MagicDeckComponent } from './magic-deck.component';

describe('MagicDeckComponent', () => {
  let component: MagicDeckComponent;
  let fixture: ComponentFixture<MagicDeckComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [MagicDeckComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MagicDeckComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
