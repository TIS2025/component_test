package org.firstinspires.ftc.teamcode.Testing;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.ServoImplEx;

@TeleOp(name = "Servo test")
public class ServoTest extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        ServoImplEx s = hardwareMap.get(ServoImplEx.class,"s");
        s.setPosition(0.5);

        waitForStart();
        while(opModeIsActive()){
            s.setPosition(gamepad1.left_stick_x/2+0.5);
            telemetry.addData("Pos",s.getPosition());
            telemetry.update();
        }
    }
}
