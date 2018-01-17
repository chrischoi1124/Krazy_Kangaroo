package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by chris on 1/13/2018.
 */
@Autonomous (name = "Autonomous", group = "Autonomous")
public class Krazy_Kangaroo_Auto extends LinearOpMode{

    private DcMotor leftMotor;
    private DcMotor rightMotor;

    @Override
    public void runOpMode() throws InterruptedException {
        leftMotor = hardwareMap.dcMotor.get("backLeftWheel");
        rightMotor = hardwareMap.dcMotor.get("backRightWheel");

        leftMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        rightMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();

        leftMotor.setPower(1);
        rightMotor.setPower(1);
        Thread.sleep(3600);
        leftMotor.setPower(0);
        rightMotor.setPower(0);

    }
}
