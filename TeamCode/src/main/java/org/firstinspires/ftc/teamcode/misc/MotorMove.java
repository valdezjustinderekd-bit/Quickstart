package org.firstinspires.ftc.teamcode.misc;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class MotorMove extends OpMode {
    private DcMotor intake = null;
    public void hardwareInit(){
        intake = hardwareMap.get(DcMotor.class, "backRightDrive");
        intake.setDirection(DcMotor.Direction.FORWARD);
    }
    public void init(){
        hardwareInit();
        telemetry.addLine("Robot Initialized");
    }
    public void loop(){
        if(gamepad1.x){
            intake.setPower(1.0);
        } else if (gamepad1.a) {
            intake.setPower(-1.0);
        }else{
            intake.setPower(0.0);
        }
    }
    public void stop(){
        intake.setPower(0);
    }
}
