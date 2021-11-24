package com.smkalihsan.javaminiproject.kredit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Objects;
import java.util.Scanner;
import java.util.Date;

public class Person {
    private String getTanggal() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        return dateFormat.format(date);
    }

    private String getWaktu() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static void main(String[] args) {
        Person tgl = new Person();
        Scanner scanner = new Scanner(System.in);

        kreditCard jenisKredit = new kreditCard("Kredit Card Bank BCA", "Kredit Card Bank Mandiri", "Kredit Card BRI", 112233, 443213, 321414,10_000_000, 10_000_000, 10_000_000, 1.3, 1.5, 1.1);
        System.out.println("Selamat datang di mesin ATM.");
        System.out.println("Jenis kartu yang dapat anda gunakan dalam mesin ATM.");
        System.out.println("Bank BCA| Bank Mandiri| Bank BRI");
        System.out.println("========================================");
        System.out.println("Gunakan nama Bank untuk memasukan kartu");
        System.out.print("Masukan kartu: ");
        String card = scanner.next();
        if (Objects.equals(card, "BCA")) {
            jenisKredit.BCA();
        } else if (Objects.equals(card, "Mandiri")) {
            jenisKredit.MANDIRI();
        } else if (Objects.equals(card, "BRI")) {
            jenisKredit.BRI();
        } else {
            System.out.println("Maaf jenis kartu yang anda masukan tidak tersedia.");
            System.exit(0);
        }

        System.out.println("Jenis kartu yang anda masukan adalah kartu kredit.");
        System.out.println("Setiap penarikan tunai akan dikenakan bunga sesuai dengan jenis kredit yang anda gunakan.");
        System.out.print("Masukan Nomer Pin Anda: ");
        int nomor = scanner.nextInt();
        System.out.println("Apakah Nomor Pin Anda sudah sesuai dengan kartu kredit " + card + " Anda");
        System.out.print(" ");
        String jawaban = scanner.next();
        if (Objects.equals(jawaban, "ya") || Objects.equals(jawaban, "iya") || Objects.equals(jawaban, "muhun") || Objects.equals(jawaban, "Ya") || Objects.equals(jawaban, "YA") || Objects.equals(jawaban, "Iya") || Objects.equals(jawaban, "IYA")) {
            if (nomor == jenisKredit.getNoPinBCA()) {
                System.out.println("Tolong masukan nominal yang ingin anda tarik");
                double nominalBCA = scanner.nextDouble();
                double jumlahBCA;
                if (nominalBCA <= jenisKredit.getSaldoBCA()) {
                    jumlahBCA = jenisKredit.getSaldoBCA() - nominalBCA;
                    System.out.println("Penarikan selesai");
                    System.out.println("Jumlah limit kartu kredit Anda sekarang " + jumlahBCA);
                    System.out.println("=============================================");
                    System.out.println("Bukti transaksi");
                    System.out.println(card);
                    System.out.println("Limit sebelum penarikan " + jenisKredit.getSaldoBCA());
                    System.out.println("Limit sesudah penarikan " + jumlahBCA);
                    System.out.println("Tanggal: " + tgl.getTanggal());
                    System.out.println("waktu: " + tgl.getWaktu());
                    System.out.println("Terimakasih sudah menggunakan layanan kami");

                } else if (jenisKredit.getSaldoBCA() <= nominalBCA) {
                    System.out.println("Maaf anda melebihi limit pinjaman.");
                    System.out.println("Silahkan masukan nominal yang ingin anda tarik");
                    double nominalBCA1 = scanner.nextDouble();
                    double jumlahBCA1;
                    if (nominalBCA1 <= jenisKredit.getSaldoBCA()) {
                        jumlahBCA1 = jenisKredit.getSaldoBCA() - nominalBCA1;
                        System.out.println("Penarikan selesai.");
                        System.out.println("Jumlah limit kartu kredit anda sekarang " + jumlahBCA1);
                        System.out.println("====================================");
                        System.out.println("Bukti transaksi");
                        System.out.println(card);
                        System.out.println("Limit sebelum penarikan " + jenisKredit.getSaldoBCA());
                        System.out.println("Limit sesudah penarikan " + jumlahBCA1);
                        System.out.println("Tanggal: " + tgl.getTanggal());
                        System.out.println("Waktu: " + tgl.getWaktu());
                        System.out.println("Terimakasih sudah menggunakan layanan kami");
                    } else {
                        System.out.println("Maaf transaksi anda gagal silahkan coba lagi");
                        System.exit(0);
                    }
                }
            } else if (nomor == jenisKredit.getNoPinMANDIRI()) {
                System.out.println("Tolong masukan nominal yang ingin anda tarik");
                double nominalMANDIRI = scanner.nextDouble();
                double jumlahMANDIRI;
                if (nominalMANDIRI <= jenisKredit.getSaldoMANDIRI()) {
                    jumlahMANDIRI = jenisKredit.getSaldoMANDIRI() - nominalMANDIRI;
                    System.out.println("Penarikan selesai");
                    System.out.println("Jumlah limit kartu kredit Anda sekarang " + jumlahMANDIRI);
                    System.out.println("=============================================");
                    System.out.println("Bukti transaksi");
                    System.out.println(card);
                    System.out.println("Limit sebelum penarikan " + jenisKredit.getSaldoMANDIRI());
                    System.out.println("Limit sesudah penarikan " + jumlahMANDIRI);
                    System.out.println("Tanggal: " + tgl.getTanggal());
                    System.out.println("waktu: " + tgl.getWaktu());
                    System.out.println("Terimakasih sudah menggunakan layanan kami");
                } else if (jenisKredit.getSaldoMANDIRI() <= nominalMANDIRI) {
                    System.out.println("Maaf anda melebihi limit pinjaman.");
                    System.out.println("Silahkan masukan nominal yang ingin anda tarik");
                    double nominalMANDIRI1 = scanner.nextDouble();
                    double jumlahMANDIRI1;
                    if (nominalMANDIRI1 <= jenisKredit.getSaldoMANDIRI()) {
                        jumlahMANDIRI1 = jenisKredit.getSaldoMANDIRI() - nominalMANDIRI1;
                        System.out.println("Penarikan selesai.");
                        System.out.println("Jumlah limit kartu kredit anda sekarang " + jumlahMANDIRI1);
                        System.out.println("====================================");
                        System.out.println("Bukti transaksi");
                        System.out.println(card);
                        System.out.println("Limit sebelum penarikan " + jenisKredit.getSaldoMANDIRI());
                        System.out.println("Limit sesudah penarikan " + jumlahMANDIRI1);
                        System.out.println("Tanggal: " + tgl.getTanggal());
                        System.out.println("Waktu: " + tgl.getWaktu());
                        System.out.println("Terimakasih sudah menggunakan layanan kami");
                    } else {
                        System.out.println("Maaf transaksi anda gagal silahkan coba lagi");
                        System.exit(0);
                    }
                }
            } else if (nomor == jenisKredit.getNoPinBRI()) {
                System.out.println("Tolong masukan nominal yang ingin anda tarik");
                double nominalBRI = scanner.nextDouble();
                double jumlahBRI;
                if (nominalBRI <= jenisKredit.getSaldoBRI()) {
                    jumlahBRI = jenisKredit.getSaldoBRI() - nominalBRI;
                    System.out.println("Penarikan selesai");
                    System.out.println("Jumlah limit kartu kredit Anda sekarang " + jumlahBRI);
                    System.out.println("=============================================");
                    System.out.println("Bukti transaksi");
                    System.out.println(card);
                    System.out.println("Limit sebelum penarikan " + jenisKredit.getSaldoBRI());
                    System.out.println("Limit sesudah penarikan " + jumlahBRI);
                    System.out.println("Tanggal: " + tgl.getTanggal());
                    System.out.println("waktu: " + tgl.getWaktu());
                    System.out.println("Terimakasih sudah menggunakan layanan kami");
                } else if (jenisKredit.getSaldoBRI() <= nominalBRI) {
                    System.out.println("Maaf anda melebihi limit pinjaman.");
                    System.out.println("Silahkan masukan nominal yang ingin anda tarik");
                    double nominalBRI1 = scanner.nextDouble();
                    double jumlahBRI1;
                    if (nominalBRI1 <= jenisKredit.getSaldoBRI()) {
                        jumlahBRI1 = jenisKredit.getSaldoBRI() - nominalBRI1;
                        System.out.println("Penarikan selesai.");
                        System.out.println("Jumlah limit kartu kredit anda sekarang " + jumlahBRI1);
                        System.out.println("====================================");
                        System.out.println("Bukti transaksi");
                        System.out.println(card);
                        System.out.println("Limit sebelum penarikan " + jenisKredit.getSaldoBRI());
                        System.out.println("Limit sesudah penarikan " + jumlahBRI1);
                        System.out.println("Tanggal: " + tgl.getTanggal());
                        System.out.println("Waktu: " + tgl.getWaktu());
                        System.out.println("Terimakasih sudah menggunakan layanan kami");
                    } else {
                        System.out.println("Maaf transaksi anda gagal silahkan coba lagi");
                        System.exit(0);
                    }
                }
            }
        } else if (Objects.equals(jawaban, "tidak") || Objects.equals(jawaban, "no")) {
            System.out.println("Silahkan pilih ulang kartu kredit dengan menggunakan nama bank untuk memasukan karu");
            System.out.print("Masukkan Kartu: ");
            String card2 = scanner.next();
            if (Objects.equals(card2, "BCA")) {
                jenisKredit.BCA();
            } else if (Objects.equals(card2, "Mandiri")) {
                jenisKredit.MANDIRI();
            } else if (Objects.equals(card2, "BRI")) {
                jenisKredit.BRI();
            } else {
                System.out.println("Maaf jenis kartu kredit yang Anda masukan tidak tersedia");
                System.exit(0);
            }
            System.out.print("Masukan Nomor Pin Anda: ");
            int nomor2 = scanner.nextInt();
            System.out.println("Apakah Nomor Pin Anda sudah sesuai dengan kartu kredit " + card2 + " Anda.");
            System.out.print(" ");
            String jawaban2 = scanner.next();
            if (Objects.equals(jawaban2, "ya") || Objects.equals(jawaban2, "iya") || Objects.equals(jawaban2, "muhun") || Objects.equals(jawaban2, "Ya") || Objects.equals(jawaban2, "YA") || Objects.equals(jawaban2, "Iya") || Objects.equals(jawaban2, "IYA")) {
                if (nomor2 == jenisKredit.getNoPinBCA()) {
                    System.out.println("Tolong masukan nominal yang ingin Anda tarik");
                    double nominalBCA2 = scanner.nextDouble();
                    double jumlahBCA2;
                    if (nominalBCA2 <= jenisKredit.getSaldoBCA()) {
                        jumlahBCA2 = jenisKredit.getSaldoBCA() - nominalBCA2;
                        System.out.println("Penarikan selesai");
                        System.out.println("Jumlah limit kartu kredit Anda sekarang " + jumlahBCA2);
                        System.out.println("=============================================");
                        System.out.println("Bukti transaksi");
                        System.out.println(card);
                        System.out.println("Limit sebelum penarikan " + jenisKredit.getSaldoBCA());
                        System.out.println("Limit sesudah penarikan " + jumlahBCA2);
                        System.out.println("Tanggal: " + tgl.getTanggal());
                        System.out.println("waktu: " + tgl.getWaktu());
                        System.out.println("Terimakasih sudah menggunakan layanan kami");
                    } else if (jenisKredit.getSaldoBCA() <= nominalBCA2) {
                        System.out.println("Maaf anda melebihi limit pinjaman.");
                        System.out.println("Silahkan masukan nominal yang ingin anda tarik");
                        double nominalBCA3 = scanner.nextDouble();
                        double jumlahBCA3;
                        if (nominalBCA3 <= jenisKredit.getSaldoBCA()) {
                            jumlahBCA3 = jenisKredit.getSaldoBCA() - nominalBCA3;
                            System.out.println("Penarikan selesai");
                            System.out.println("Jumlah limit kartu kredit Anda sekarang " + jumlahBCA3);
                            System.out.println("========================================");
                            System.out.println("Bukti transaksi");
                            System.out.println(card);
                            System.out.println("Limit sebelum penarikan " + jenisKredit.getSaldoBCA());
                            System.out.println("Limit sesudah penarikan " + jumlahBCA3);
                            System.out.println("Tanggal: " + tgl.getTanggal());
                            System.out.println("Waktu: " + tgl.getWaktu());
                            System.out.println("Terimakasih sudah menggunakan layanan kami");
                        } else  {
                            System.out.println("Maaf transaksi anda gagal silahkan coba lagi");
                            System.exit(0);
                        }
                    }
                } else if (nomor2 == jenisKredit.getNoPinMANDIRI()) {
                    System.out.println("Tolong masukan nominal yang ingin anda tarik");
                    double nominalMANDIRI2 = scanner.nextDouble();
                    double jumlahMANDIRI2;
                    if (nominalMANDIRI2 <= jenisKredit.getSaldoMANDIRI()) {
                        jumlahMANDIRI2 = jenisKredit.getSaldoMANDIRI() - nominalMANDIRI2;
                        System.out.println("Penarikan selesai");
                        System.out.println("Jumlah limit kartu kredit Anda sekarang " + jumlahMANDIRI2);
                        System.out.println("=============================================");
                        System.out.println("Bukti transaksi");
                        System.out.println(card);
                        System.out.println("Limit sebelum penarikan " + jenisKredit.getSaldoMANDIRI());
                        System.out.println("Limit sesudah penarikan " + jumlahMANDIRI2);
                        System.out.println("Tanggal: " + tgl.getTanggal());
                        System.out.println("waktu: " + tgl.getWaktu());
                        System.out.println("Terimakasih sudah menggunakan layanan kami");
                    } else if (jenisKredit.getSaldoMANDIRI() <= nominalMANDIRI2) {
                        System.out.println("Maaf anda melebihi limit pinjaman.");
                        System.out.println("Silahkan masukan nominal yang ingin anda tarik");
                        double nominalMANDIRI3 = scanner.nextDouble();
                        double jumlahMANDIRI3;
                        if (nominalMANDIRI3 <= jenisKredit.getSaldoMANDIRI()) {
                            jumlahMANDIRI3 = jenisKredit.getSaldoMANDIRI() - nominalMANDIRI3;
                            System.out.println("Penarikan selesai.");
                            System.out.println("Jumlah limit kartu kredit anda sekarang " + jumlahMANDIRI3);
                            System.out.println("====================================");
                            System.out.println("Bukti transaksi");
                            System.out.println(card);
                            System.out.println("Limit sebelum penarikan " + jenisKredit.getSaldoMANDIRI());
                            System.out.println("Limit sesudah penarikan " + jumlahMANDIRI3);
                            System.out.println("Tanggal: " + tgl.getTanggal());
                            System.out.println("Waktu: " + tgl.getWaktu());
                            System.out.println("Terimakasih sudah menggunakan layanan kami");
                        } else {
                            System.out.println("Maaf transaksi anda gagal silahkan coba lagi");
                            System.exit(0);
                        }
                    }
                } else if (nomor2 == jenisKredit.getNoPinBRI()) {
                    System.out.println("Tolong masukan nominal yang ingin anda tarik");
                    double nominalBRI2 = scanner.nextDouble();
                    double jumlahBRI2;
                    if (nominalBRI2 <= jenisKredit.getSaldoBRI()) {
                        jumlahBRI2 = jenisKredit.getSaldoBRI() - nominalBRI2;
                        System.out.println("Penarikan selesai");
                        System.out.println("Jumlah limit kartu kredit Anda sekarang " + jumlahBRI2);
                        System.out.println("=============================================");
                        System.out.println("Bukti transaksi");
                        System.out.println(card);
                        System.out.println("Limit sebelum penarikan " + jenisKredit.getSaldoBRI());
                        System.out.println("Limit sesudah penarikan " + jumlahBRI2);
                        System.out.println("Tanggal: " + tgl.getTanggal());
                        System.out.println("waktu: " + tgl.getWaktu());
                        System.out.println("Terimakasih sudah menggunakan layanan kami");
                    } else if (jenisKredit.getSaldoBRI() <= nominalBRI2) {
                        System.out.println("Maaf anda melebihi limit pinjaman.");
                        System.out.println("Silahkan masukan nominal yang ingin anda tarik");
                        double nominalBRI3 = scanner.nextDouble();
                        double jumlahBRI3;
                        if (nominalBRI3 <= jenisKredit.getSaldoBRI()) {
                            jumlahBRI3 = jenisKredit.getSaldoBRI() - nominalBRI3;
                            System.out.println("Penarikan selesai");
                            System.out.println("Jumlah limit kartu kredit Anda sekarang " + jumlahBRI3);
                            System.out.println("=============================================");
                            System.out.println("Bukti transaksi");
                            System.out.println(card);
                            System.out.println("Limit sebelum penarikan " + jenisKredit.getSaldoBRI());
                            System.out.println("Limit sesudah penarikan " + jumlahBRI3);
                            System.out.println("Tanggal: " + tgl.getTanggal());
                            System.out.println("waktu: " + tgl.getWaktu());
                            System.out.println("Terimakasih sudah menggunakan layanan kami");
                        } else {
                            System.out.println("Maaf transaksi anda gagal silahkan coba lagi");
                            System.exit(0);
                        }
                    } else {
                        System.out.println("Maaf transaksi anda gagal silahkan coba lagi");
                        System.exit(0);
                    }
                } else {
                    System.out.println("Maaf nomor pin yang Anda masukan salah silahkan ulangi lagi");
                    System.exit(0);
                }
            } else {
                System.out.println("Maaf transaksi Anda gagal silahkan coba lagi");
                System.exit(0);
            }
        } else {
            System.out.println("Maaf transaksi Anda gagal silahkan coba lagi");
            System.exit(0);
        }
    }
}
