package military;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        List<SoldierImpl> soldiers = new ArrayList<>();
        List<PrivateImpl> privates = new ArrayList<>();

        while (!line.equals("End")) {
            String[] tokens = line.split("\\s+");
            String crp;
            switch (tokens[0]) {
                case "Private":
                    PrivateImpl priv = new PrivateImpl(Integer.parseInt(tokens[1]), tokens[2],
                            tokens[3], Double.parseDouble(tokens[4]));
                    soldiers.add(priv);
                    privates.add(priv);
                    break;
                case "LeutenantGeneral":
                    LieutenantGeneralImpl lg = new LieutenantGeneralImpl(Integer.parseInt(tokens[1]), tokens[2],
                            tokens[3], Double.parseDouble(tokens[4]));
                    if (tokens.length > 5) {
                        for (int i = 5; i < tokens.length; i++) {
                            int id = Integer.parseInt(tokens[i]);
                            for (PrivateImpl aPrivate : privates) {
                                if (aPrivate.getId() == id) {
                                    lg.addPrivate(aPrivate);
                                }
                            }
                        }
                    }

                    soldiers.add(lg);
                    break;
                case "Engineer":
                    crp = tokens[5];
                    if (crp.equals("Airforces") || crp.equals("Marines")) {
                        EngineerImpl engineer = new EngineerImpl(Integer.parseInt(tokens[1]), tokens[2],
                                tokens[3], Double.parseDouble(tokens[4]), Corp.valueOf(crp.toUpperCase()));

                        if (tokens.length > 6) {
                            for (int i = 6; i < tokens.length; i += 2) {
                                int id = Integer.parseInt(tokens[i + 1]);
                                Repair repair = new Repair(tokens[i], Integer.parseInt(tokens[i + 1]));
                                engineer.addRepair(repair);
                            }
                        }
                        soldiers.add(engineer);
                    }
                    break;
                case "Commando":
                    crp = tokens[5];
                    if (crp.equals("Airforces") || crp.equals("Marines")) {
                        CommandoImpl commando = new CommandoImpl(Integer.parseInt(tokens[1]), tokens[2],
                                tokens[3], Double.parseDouble(tokens[4]), Corp.valueOf(crp.toUpperCase()));

                        if (tokens.length > 6) {
                            for (int i = 6; i < tokens.length; i += 2) {
                                String state = tokens[i + 1];
                                if (state.equals("inProgress") || state.equals("Finished")) {
                                    Mission mission = new Mission(tokens[i], State.valueOf(tokens[i + 1].toUpperCase()));
                                    commando.addMission(mission);
                                }
                            }
                        }
                        soldiers.add(commando);
                    }
                    break;
                case "Spy":
                    SpyImpl spy = new SpyImpl(Integer.parseInt(tokens[1]), tokens[2], tokens[3], tokens[4]);
                    soldiers.add(spy);
                    break;
            }
            line = reader.readLine();
        }

        for (SoldierImpl soldier : soldiers) {
                System.out.println(soldier);
            }
        }
    }
