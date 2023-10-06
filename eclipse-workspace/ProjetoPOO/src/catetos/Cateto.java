package catetos;

public class Cateto {
double ca, cb , h, h2;

public void hipo() {
h = Math.pow(ca, 2) + Math.pow( cb,2);
h2 = Math.sqrt(h);
System.out.println(h2);
}
}
