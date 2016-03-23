package doSomething;
public class dosomethingElse;

int doSomethingElse(int[] ar) {

  int val = -1;

  for(int i = 0; i < ar.length; i++) {

    if(ar[i] % 3 == 0 && ar[i] > val) {

      val = ar[i];

    }

  }

  return val;

}