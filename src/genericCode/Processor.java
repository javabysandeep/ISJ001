package genericCode;

public interface Processor<INPUT, OUTPUT> {
    OUTPUT process(INPUT input);

}
