package org.firstinspires.ftc.teamcode.opmode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.pedropathing.follower.Follower;
import com.pedropathing.api.PoseFactory;
import com.pedropathing.math.Pose;
import org.firstinspires.ftc.teamcode.pedro.Constants;

@Autonomous
public class MainAuto extends OpMode {

    private Follower follower;

    @Override
    public void init(){
        follower = Constants.create(hardwareMap);
    }
    public void start(){

    }

    @Override
    public void loop(){

    }
}
