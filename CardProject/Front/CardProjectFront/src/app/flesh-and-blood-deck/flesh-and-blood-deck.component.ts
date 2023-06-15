import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-flesh-and-blood-deck',
  templateUrl: './flesh-and-blood-deck.component.html',
  styleUrls: ['./flesh-and-blood-deck.component.scss']
})
export class FleshAndBloodDeckComponent {
  formGroup: FormGroup=this.fb.group({
    name: [[Validators.required, Validators.minLength(3)]],

  })

  registered: boolean = false;

  constructor(
    private fb: FormBuilder
  ) {}

}
