import { Component } from '@angular/core';
import{FormBuilder, FormGroup} from '@angular/forms'
@Component({
  selector: 'app-magic-deck',
  templateUrl: './magic-deck.component.html',
  styleUrls: ['./magic-deck.component.scss']
})
export class MagicDeckComponent {

  form: FormGroup = this.fb.group({

  })

  registered: boolean = false;

  constructor(

    private fb: FormBuilder
  ) {}
}
