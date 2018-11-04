package interfacesegregation;

public class InterfaceSegregation {

    class Document {
        private String data;
    }

    interface Machine {
        void print(Document document);
        void fax(Document document) throws Exception;
        void scan(Document document) throws Exception;
    }

    class OldFashinablePrinter implements Machine {

        @Override
        public void print(Document document) {
            // print
        }

        @Override
        public void fax(Document document) throws Exception {
            throw new Exception();
        }

        @Override
        public void scan(Document document) throws Exception{
            throw new Exception();
        }
    }

    interface IPrinter {
        void print(Document document) throws Exception;
    }

    interface IScanner {
        void scan(Document document) throws Exception;
    }

    class JustPrinter implements IPrinter{

        @Override
        public void print(Document document) throws Exception {

        }
    }

    class Photocopier implements IPrinter, IScanner {

        @Override
        public void print(Document document) throws Exception {

        }

        @Override
        public void scan(Document document) throws Exception {

        }
    }

    interface PrinterScannerMachine extends IScanner, IPrinter{}

    class PrinterScanner implements PrinterScannerMachine {

        @Override
        public void print(Document document) throws Exception {

        }

        @Override
        public void scan(Document document) throws Exception {

        }
    }

}
