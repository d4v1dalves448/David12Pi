public class Computador {
    private CPU cpu;

    public Computador(String modeloCPU) {
        //A CPU vai ser
        this.cpu = new CPU(modeloCPU);
    }

    public void mostrarCPU() {
        System.out.println("Computador com CPU " + cpu.getModelo());
    }
}
