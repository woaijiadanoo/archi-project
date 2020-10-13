package com.sishuok.jiangzh.archi.designs.command.demo.common;

import com.sishuok.jiangzh.archi.designs.command.demo.v3.CommandModel;

public interface Command {

    void execute(CommandModel commandModel);

}
