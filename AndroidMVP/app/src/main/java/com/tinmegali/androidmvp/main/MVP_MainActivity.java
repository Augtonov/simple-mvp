package com.tinmegali.androidmvp.main;

import com.tinmegali.mvp.mvp.ActivityView;
import com.tinmegali.mvp.mvp.ModelOps;
import com.tinmegali.mvp.mvp.PresenterOps;

/**
 * ---------------------------------------------------
 * Created by Tin Megali on 25/02/16.
 * Project: AndroidMVP
 * ---------------------------------------------------
 * <a href="http://www.tinmegali.com">tinmegali.com</a>
 * <a href="http://www.github.com/tinmegali>github</a>
 * ---------------------------------------------------
 * Based on <a href="https://github.com/douglascraigschmidt/POSA-15/tree/master/ex/AcronymExpander/src/vandy/mooc">
 * framework MVP</a> developed by
 * <a href="https://github.com/douglascraigschmidt">
 * Dr. Douglas Schmidth</a>
 * ---------------------------------------------------
 *
 * Interface that holds all operations available to MVP layers.
 * Controls the communication process between each layer
 *
 * <strong>Using</strong>
 * <ul>
 *     <li> // TODO english comments
 *         Crie as interfaces de comunicação entre os módulos View, Presenter e Model
 *          <ol>
 *              <li>
 *             interface <code>RequiredViewOps</code> fornece métodos para <code>Presenter</code>
 *         comunicar com <code>View</code>. É necessário extender <code>ActivityView</code>
 *              </li>
 *              <li>
 *                  interface <code>ProvidedPresenterOps</code> fornece operações oferecidas
 *                  ao layer View para comunicação com Presenter.
 *                  É preciso extender <code>PresenterOps<RequiredViewOps></code>
 *              </li>
 *              <li>
 *                  interface <code>RequiredPresenterOps</code> operações oferecidas
 *                  pelo layer Presenter para comunicações com Model
 *              </li>
 *              <li>
 *                  interface <code>ProvidedModelOps</code> operações oferecidos pelo
 *                  layer Model para comunicações com Presenter.
 *                  É preciso extender <code>ModelOps<RequiredPresenterOps></code>
 *              </li>
 *          </ol>
 *     </li>
 *     <li>
 *         Crie a classe <code>Model</code> extendendo <code>GenericModel<RequiredPresenterOps></code>
 *         e implementando <code>ProvidedModelOps</code>
 *         ex: {@link com.tinmegali.androidmvp.main.model.MainModel}
 *     </li>
 *     <li>
 *         Crie a classe <code>Presenter</code> extendendo <code>GenericPresenter</code>,
 *         implementando <code>RequiredPresenterOps</code> e <code>ProvidedPresenterOps</code>.
 *         exemplo: {@link com.tinmegali.androidmvp.main.presenter.MainPresenter}
 *     </li>
 *     <li>
 *         Crie a classe <code>View</code> GenericMVPActivity ou GenericMVPFragment e
 *         implementando <code>RequiredViewOps</code>
 *         Exemplo: {@link com.tinmegali.androidmvp.main.view.MainActivity}
 *     </li>.
 * </ul>
 *
 * Interface guarda-chuva, que armazena todas operações disponíveis
 * para realizar comunicações entre os diferentes layer
 * do Model View Presenter
 *
 * <strong>Utilizando</strong>
 * <ul>
 *     <li>
 *         Crie as interfaces de comunicação entre os módulos View, Presenter e Model
 *          <ol>
 *              <li>
 *             interface <code>RequiredViewOps</code> fornece métodos para <code>Presenter</code>
 *         comunicar com <code>View</code>. É necessário extender <code>ActivityView</code>
 *              </li>
 *              <li>
 *                  interface <code>ProvidedPresenterOps</code> fornece operações oferecidas
 *                  ao layer View para comunicação com Presenter.
 *                  É preciso extender <code>PresenterOps<RequiredViewOps></code>
 *              </li>
 *              <li>
 *                  interface <code>RequiredPresenterOps</code> operações oferecidas
 *                  pelo layer Presenter para comunicações com Model
 *              </li>
 *              <li>
 *                  interface <code>ProvidedModelOps</code> operações oferecidos pelo
 *                  layer Model para comunicações com Presenter.
 *                  É preciso extender <code>ModelOps<RequiredPresenterOps></code>
 *              </li>
 *          </ol>
 *     </li>
 *     <li>
 *         Crie a classe <code>Model</code> extendendo <code>GenericModel<RequiredPresenterOps></code>
 *         e implementando <code>ProvidedModelOps</code>
 *         ex: {@link com.tinmegali.androidmvp.main.model.MainModel}
 *     </li>
 *     <li>
 *         Crie a classe <code>Presenter</code> extendendo <code>GenericPresenter</code>,
 *         implementando <code>RequiredPresenterOps</code> e <code>ProvidedPresenterOps</code>.
 *         exemplo: {@link com.tinmegali.androidmvp.main.presenter.MainPresenter}
 *     </li>
 *     <li>
 *         Crie a classe <code>View</code> GenericMVPActivity ou GenericMVPFragment e
 *         implementando <code>RequiredViewOps</code>
 *         Exemplo: {@link com.tinmegali.androidmvp.main.view.MainActivity}
 *     </li>.
 * </ul>
 *
 */


public interface MVP_MainActivity {

    /**
     * Required VIEW methods available to PRESENTER
     *      PRESENTER to VIEW
     *
     * Métodos obrigatórios em VIEW, disponíveis para PRESENTER
     */
    interface RequiredViewOps extends ActivityView {
    }


    /**
     * Operations offered to VIEW to communicate with PRESENTER
     *      VIEW to PRESENTER
     *
     * operações oferecidas ao layer VIEW para comunicação com PRESENTER
     */
    interface ProvidedPresenterOps extends PresenterOps<RequiredViewOps> {
    }

    /**
     * Required PRESENTER methods available to MODEL
     *      MODEL to PRESENTER
     *
     * operações oferecidas pelo layer PRESENTER para comunicações com MODEL
     */
    interface RequiredPresenterOps {
    }

    /**
     * Operations offered to MODEL to communicate with PRESENTER
     *      PRESENTER to MODEL
     *
     * operações oferecidos pelo layer MODEL para comunicações com PRESENTER
     */
    interface ProvidedModelOps extends ModelOps<RequiredPresenterOps> {
    }

}
