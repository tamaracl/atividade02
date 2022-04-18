package examples.triangles;

public class Triangles {

    public String getType(int a, int b, int c){
        String tipo = "Escaleno";
        if (a <=0 || b <=0 || c <=0){
            tipo = "Inexistente";
        } else
        if(!(a+b >c && a+c >b && b+c >a)){
            tipo = "Inexistente";
        } else
        if(a ==b){
            tipo = "Isoceles";
            if (b==c){
                tipo = "Equilatero";
            }
        }else
        if (b ==c || a ==c){
            tipo ="Isoceles";
        }
        return tipo;
    }
}

