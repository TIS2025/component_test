package org.firstinspires.ftc.teamcode.Testing;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

import org.firstinspires.ftc.robotcore.external.navigation.CurrentUnit;

@TeleOp(name = "Motor Test")
public class MotorTest extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        DcMotorEx m = hardwareMap.get(DcMotorEx.class,"m");
//        m.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        waitForStart();
        while (opModeIsActive()){
            m.setPower(gamepad1.left_stick_x);
            telemetry.addData("Power",m.getPower());
            telemetry.addData("Velocity",m.getVelocity());
            telemetry.addData("Current",m.getCurrent(CurrentUnit.MILLIAMPS));
            telemetry.addData("Encoder",m.getCurrentPosition());
            telemetry.update();
        }
    }
}
