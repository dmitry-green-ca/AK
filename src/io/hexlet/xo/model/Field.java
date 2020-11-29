package io.hexlet.xo.model;

public class Field {
    public static final boolean ENABLE_HARD_TEST = false;
    private final int fieldSize = 3;
    public String f00;
    public String f01;
    public String f02;

    public String f10;
    public String f11;
    public String f12;

    public String f20;
    public String f21;
    public String f22;

    public int getSize() {
        return fieldSize;
    }

    public String getFigure(Point point) {

        if ((point.coordinateX >= 0 && point.coordinateX < fieldSize) && (point.coordinateY >= 0 && point.coordinateY < fieldSize)) {


            if (point.coordinateX == 0) {
                if (point.coordinateY == 0) {
                    return f00;
                }
                if (point.coordinateY == 1) {
                    return f01;
                }
                if (point.coordinateY == 2) {
                    return f02;
                }
            }
            if (point.coordinateX == 1) {
                if (point.coordinateY == 0) {
                    return f10;
                }
                if (point.coordinateY == 1) {
                    return f11;
                }
                if (point.coordinateY == 2) {
                    return f12;
                }
            }
            if (point.coordinateX == 2) {
                if (point.coordinateY == 0) {
                    return f20;
                }
                if (point.coordinateY == 1) {
                    return f21;
                }
                if (point.coordinateY == 2) {
                    return f22;
                }
            }

        }
        return "Coordinate is wrong!";
    }

    public boolean setFigure(Point point, String figure) {

        if (point.coordinateX == 0) {
            if (point.coordinateY == 0) {
                f00 = figure;
                return true;
            }
            if (point.coordinateY == 1) {
                f01 = figure;
                return true;
            }
            if (point.coordinateY == 2) {
                f02 = figure;
                return true;
            }
        }
        if (point.coordinateX == 1) {
            if (point.coordinateY == 0) {
                f10 = figure;
                return true;
            }
            if (point.coordinateY == 1) {
                f11 = figure;
                return true;
            }
            if (point.coordinateY == 2) {
                f12 = figure;
                return true;
            }
        }
        if (point.coordinateX == 2) {
            if (point.coordinateY == 0) {
                f20 = figure;
                return true;
            }
            if (point.coordinateY == 1) {
                f21 = figure;
                return true;
            }
            if (point.coordinateY == 2) {
                f22 = figure;
                return true;
            }
        }

        return false;
    }

    // printer Ниже идет пример не лучшего кода, там присутствует дублирование кода.
    // По мере прохождения курса — мы это переделаем.
    public static void printField(final Field field) {

        String printingField = "current Game Field:\n"
                + "\t  x:   0     1     2\n"
                + "\ty:\n\t0    "
                + makeLine(field, 0)
                + "\n\t    ~~~~~~~~~~~~~~~~"
                + "\n\t1    "
                + makeLine(field, 1)
                + "\n\t    ~~~~~~~~~~~~~~~~"
                + "\n\t2    "
                + makeLine(field, 2);
        System.out.println(printingField);
    }

    private static String makeLine(final Field field, int lineNumber) {
        String result;
        switch (lineNumber) {  // java14 switch
            case 0: {
                if (field.f00 == null) {
                    result = "null ";
                } else {
                    result = "  " + field.f00 + "  ";
                }
                result = result + "|";

                if (field.f01 == null) {
                    result = result + "null ";
                } else {
                    result = result + "  " + field.f01 + "  ";
                }

                result = result + "|";

                if (field.f02 == null) {
                    result = result + "null ";
                } else {
                    result = result + "  " + field.f02 + "  ";
                }
                return result;
            }
            case 1: {
                if (field.f10 == null) {
                    result = "null ";
                } else {
                    result = "  " + field.f10 + "  ";
                }
                result = result + "|";

                if (field.f11 == null) {
                    result = result + "null ";
                } else {
                    result = result + "  " + field.f11 + "  ";
                }

                result = result + "|";

                if (field.f12 == null) {
                    result = result + "null ";
                } else {
                    result = result + "  " + field.f12 + "  ";
                }
                return result;
            }
            case 2: {
                if (field.f20 == null) {
                    result = "null ";
                } else {
                    result = "  " + field.f20 + "  ";
                }
                result = result + "|";

                if (field.f21 == null) {
                    result = result + "null ";
                } else {
                    result = result + "  " + field.f21 + "  ";
                }

                result = result + "|";

                if (field.f22 == null) {
                    result = result + "null ";
                } else {
                    result = result + "  " + field.f22 + "  ";
                }
                return result;
            }
            default: {
            }
        }
        return null;
    }
}
