import { TestBed } from '@angular/core/testing';

import { G4yShopFormService } from './g4y-shop-form.service';

describe('G4yShopFormService', () => {
  let service: G4yShopFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(G4yShopFormService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
