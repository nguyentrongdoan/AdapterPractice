package code;

import code.FileCalculator;

public class Client {
    private FileCalculator fileCalculator;

    public Client(FileCalculator fileCalculator) {
        this.fileCalculator = fileCalculator;
    }

    // tao phuong thuc printFileSize de hien thi kich thuoc file.
    public void printFileSize(String path){
        long size = fileCalculator.calculatorSize(path);
        System.out.println("Size:" + size);
    }
    //Lớp code.Client không trực tiếp sử dụng được lớp JavaUtil từ thư viện có sẵn, do đó chúng ta cần tạo
    // một lớp FileCalculatorAdapter để thực hiện việc chuyển đổi
}
