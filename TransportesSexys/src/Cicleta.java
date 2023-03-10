public class Cicleta  implements Intermedio{
    public Float costeTotal(Integer cp){
    float precio=0;
    if(cp>36000){
        precio=15;
    }else{
        precio=10;
    }
    return precio;
    }
}