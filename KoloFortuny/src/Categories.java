import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Categories {
    private String pytanie = null;
    private String odp1 = null;
    private String odp2 = null;
    private String odp3 = null;
    private String odp4 = null;
    private String poprawanaOdp = null;
    private int difficulty;

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    private int option;

    public void setOption(int option) {
        this.option = option;
    }

    public String getPytanie() {
        return pytanie;
    }

    public String getOdp1() {
        return odp1;
    }

    public String getOdp2() {
        return odp2;
    }

    public String getOdp3() {
        return odp3;
    }

    public String getOdp4() {
        return odp4;
    }

    public String getPoprawanaOdp() {
        return poprawanaOdp;
    }

    File plik = new File("pytania.txt");

    public void pytanie() {
        if (option == 1) {
            if (difficulty == 1) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(1);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(2);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(3);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(4);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(5);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(6);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (difficulty == 2) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(7);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(8);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(9);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(10);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(11);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(12);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (difficulty == 3) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(13);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(14);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(15);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(16);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(17);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(18);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else if (option == 2) {
            if (difficulty == 1) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(20);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(21);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(22);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(23);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(24);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(25);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (difficulty == 2) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(26);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(27);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(28);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(29);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(30);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(31);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (difficulty == 3) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(32);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(33);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(34);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(35);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(36);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(37);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else if (option == 3) {
            if (difficulty == 1) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(39);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(40);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(41);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(42);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(43);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(44);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (difficulty == 2) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(45);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(46);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(47);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(48);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(49);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(50);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (difficulty == 3) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(51);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(52);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(53);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(54);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(55);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(56);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else if (option == 4) {
            if (difficulty == 1) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(58);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(59);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(60);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(61);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(62);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(63);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (difficulty == 2) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(64);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(65);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(66);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(67);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(68);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(69);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (difficulty == 3) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(70);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(71);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(72);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(73);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(74);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(75);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else if (option == 5) {
            if (difficulty == 1) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(77);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(78);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(79);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(80);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(81);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(82);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (difficulty == 2) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(83);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(84);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(85);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(86);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(87);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(88);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (difficulty == 3) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(89);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(90);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(91);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(92);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(93);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(94);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else if (option == 6) {
            if (difficulty == 1) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(96);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(97);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(98);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(99);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(100);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(101);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (difficulty == 2) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(102);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(103);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(104);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(105);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(106);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(107);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (difficulty == 3) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(108);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(109);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(110);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(111);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(112);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(113);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else if (option == 7) {
            if (difficulty == 1) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(115);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(116);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(117);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(118);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(119);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(120);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (difficulty == 2) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(121);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(122);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(123);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(124);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(125);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(126);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (difficulty == 3) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(127);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(128);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(129);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(130);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(131);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(132);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else if (option == 8) {
            if (difficulty == 1) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(134);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(135);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(136);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(137);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(138);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(139);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (difficulty == 2) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(140);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(141);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(142);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(143);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(144);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(145);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (difficulty == 3) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(146);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(147);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(148);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(149);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(150);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(151);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else if (option == 9) {
            if (difficulty == 1) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(153);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(154);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(155);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(156);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(157);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(158);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (difficulty == 2) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(159);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(160);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(161);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(162);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(163);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(164);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (difficulty == 3) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(165);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(166);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(167);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(168);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(169);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(170);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else if (option == 10) {
            if (difficulty == 1) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(172);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(173);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(174);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(175);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(176);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(177);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (difficulty == 2) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(178);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(179);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(180);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(181);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(182);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(183);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (difficulty == 3) {
                try {
                    pytanie = Files.readAllLines(Paths.get("pytania.txt")).get(184);
                    odp1 = Files.readAllLines(Paths.get("pytania.txt")).get(185);
                    odp2 = Files.readAllLines(Paths.get("pytania.txt")).get(186);
                    odp3 = Files.readAllLines(Paths.get("pytania.txt")).get(187);
                    odp4 = Files.readAllLines(Paths.get("pytania.txt")).get(188);
                    poprawanaOdp = Files.readAllLines(Paths.get("pytania.txt")).get(189);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}