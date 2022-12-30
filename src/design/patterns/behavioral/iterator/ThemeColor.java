package design.patterns.behavioral.iterator;

public enum ThemeColor {
    RED,
    BLUE,
    YELLOW,
    ORANGE;
    public  static Iterator<ThemeColor> getIterator(){
        return new ThemeColorIterator();
    }
    private static class ThemeColorIterator implements  Iterator<ThemeColor>{
        private int position=0;
        @Override
        public boolean hasNext() {
            return position<ThemeColor.values().length;
        }

        @Override
        public ThemeColor next() {
            return ThemeColor.values()[position++];
        }
    }
}
