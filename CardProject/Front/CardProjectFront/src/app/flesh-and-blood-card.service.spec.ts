import { TestBed } from '@angular/core/testing';

import { FleshAndBloodCardService } from './flesh-and-blood-card.service';

describe('FleshAndBloodCardService', () => {
  let service: FleshAndBloodCardService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FleshAndBloodCardService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
