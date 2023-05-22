package Additional.DIServiceLoaderTask;

public class Main {
    public static void main(String[] args){
        DIServiceLoader<Actor> diServiceloader = DIServiceLoader.load(Actor.class);
        Actor bean1 = diServiceloader.getBean("Bean1");
        Actor bean2 = diServiceloader.getBean(Actor2.class);
        System.out.print("With Bean1: ");
        bean1.act();
        System.out.print("With Actor2.class: ");
        bean2.act();

        for (Actor actor : diServiceloader) {
            actor.act();
        }
    }
}
