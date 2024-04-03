package com.javaex.oop.point.v1;

public class Tv {
    private int channel;
    private int volume;
    private boolean power;

    // 생성자
    public Tv() {
        this.channel = 7;
        this.volume = 20;
        this.power = false;
    }

    // 오버로딩된 생성자
    public Tv(int channel, int volume, boolean power) {
        this.channel = channel;
        this.volume = volume;
        this.power = power;
    }

    // Getter 메서드만 작성
    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isPower() {
        return power;
    }

    // TV 전원 제어 메서드
    public void power(boolean on) {
        this.power = on;
    }

    // 채널 변경 메서드
    public void channel(int channel) {
        if (channel >= 1 && channel <= 255) {
            this.channel = channel;
        }
    }

    // 채널 증감 메서드 (오버로딩)
    public void channel(boolean up) {
        if (up) {
            if (channel < 255) {
                this.channel++;
            }
        } else {
            if (channel > 1) {
                this.channel--;
            }
        }
    }

    // 볼륨 변경 메서드
    public void volume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }

    // 볼륨 증감 메서드 (오버로딩)
    public void volume(boolean up) {
        if (up) {
            if (volume < 100) {
                this.volume++;
            }
        } else {
            if (volume > 0) {
                this.volume--;
            }
        }
    }

    // TV 정보 출력 메서드
    public void status() {
        System.out.println("TV Power: " + (power ? "On" : "Off"));
        System.out.println("Channel: " + channel);
        System.out.println("Volume: " + volume);
    }

    // main 메서드
    public static void main(String[] args) {
        Tv tv = new Tv(); // 기본 생성자로 TV 객체 생성
        tv.status(); // TV 정보 출력

        // TV 전원 켜기
        tv.power(true);
        tv.status(); // TV 정보 출력

        // 채널 변경
        tv.channel(10);
        tv.status(); // TV 정보 출력

        // 볼륨 증가
        tv.volume(true);
        tv.status(); // TV 정보 출력

        // 채널 증가
        tv.channel(true);
        tv.status(); // TV 정보 출력

        // 볼륨 감소
        tv.volume(false);
        tv.status(); // TV 정보 출력
    }
}