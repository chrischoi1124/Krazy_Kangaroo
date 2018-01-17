package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by chris on 12/9/2017.
 */
@TeleOp (name = "TeleOp",group = "TeleOp")
public class Krazy_Kangaroo extends OpMode{

    private DcMotor leftMotor = null;
    private DcMotor rightMotor = null;
    private DcMotor bigflipper = null;
    private DcMotor littleflipper = null;

    @Override
    public void init() {

        leftMotor = hardwareMap.dcMotor.get("backLeftWheel");
        rightMotor = hardwareMap.dcMotor.get("backRightWheel");
        bigflipper = hardwareMap.dcMotor.get("bigFlipper");
        littleflipper = hardwareMap.dcMotor.get("littleFlipper");

        leftMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        rightMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        bigflipper.setDirection(DcMotorSimple.Direction.REVERSE);
        littleflipper.setDirection(DcMotorSimple.Direction.REVERSE);


        telemetry.addData("Status", "Initialized");
    }

    @Override
    public void loop() {

        float left_power = -gamepad1.left_stick_y;
        float right_power = -gamepad1.right_stick_y;
        float bigflip = -gamepad2.right_stick_y;
        float littleflip = -gamepad2.left_stick_y;

        leftMotor.setPower(left_power);
        rightMotor.setPower(right_power);
        bigflipper.setPower(bigflip*0.7);
        littleflipper.setPower(littleflip*0.7);

    }
}
