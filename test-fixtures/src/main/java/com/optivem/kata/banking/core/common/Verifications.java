package com.optivem.kata.banking.core.common;

import an.awesome.pipelinr.Command;
import com.optivem.kata.banking.core.Facade;
import com.optivem.kata.banking.core.common.verifies.*;
import org.junit.jupiter.api.function.Executable;

public class Verifications {

    public static ExecutableVerify verifyThat(Executable executable) {
        return new ExecutableVerify(executable);
    }

    public static <R extends Command<P>, P> UseCaseVerify<R, P> verifyThat(Command.Handler<R, P> useCase) {
        return new UseCaseVerify<>(useCase);
    }

    public static FacadeVerify verifyThat(Facade facade) {
        return new FacadeVerify(facade);
    }


}
