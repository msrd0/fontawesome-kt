/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

object FA_VIAL_VIRUS: Icon {
	
	override val name get() = "Vial Virus"
	
	override val unicode get() = "e597"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M256 32C273.7 32 288 46.33 288 64C288 81.67 273.7 96 256 96V207.1C252.9 209.1 249.9 211.5 247.2 214.2C225.3 236.1 225.3 271.6 247.2 293.4C247.4 293.6 247.4 293.7 247.5 293.8L247.5 293.8C247.5 293.9 247.5 294.1 247.4 294.4C247.3 294.6 247.1 294.8 247.1 294.8L247 294.9C246.1 294.9 246.8 294.9 246.6 294.9C215.7 294.9 190.6 319.1 190.6 350.9C190.6 381.8 215.7 406.9 246.6 406.9C246.8 406.9 246.1 406.9 247 406.9L247.1 406.9C247.1 406.1 247.3 407.1 247.4 407.4C247.5 407.7 247.5 407.9 247.5 407.1L247.5 408C247.4 408.1 247.4 408.2 247.2 408.3C236 419.5 230.6 434.2 230.8 448.8C213.3 467.1 188 480 160 480C106.1 480 64 437 64 384V96C46.33 96 32 81.67 32 64C32 46.33 46.33 32 64 32H256zM192 192V96H128V192H192zM383.8 189.7C397.1 189.7 407.8 200.4 407.8 213.7C407.8 242.9 443.2 257.6 463.9 236.9C473.3 227.5 488.5 227.5 497.8 236.9C507.2 246.2 507.2 261.4 497.8 270.8C477.2 291.5 491.8 326.9 521.1 326.9C534.3 326.9 545.1 337.6 545.1 350.9C545.1 364.1 534.3 374.9 521.1 374.9C491.8 374.9 477.2 410.3 497.8 430.9C507.2 440.3 507.2 455.5 497.8 464.9C488.5 474.3 473.3 474.3 463.9 464.9C443.2 444.2 407.8 458.9 407.8 488.1C407.8 501.4 397.1 512.1 383.8 512.1C370.6 512.1 359.8 501.4 359.8 488.1C359.8 458.9 324.5 444.2 303.8 464.9C294.4 474.3 279.2 474.3 269.8 464.9C260.5 455.5 260.5 440.3 269.8 430.9C290.5 410.3 275.9 374.9 246.6 374.9C233.4 374.9 222.6 364.1 222.6 350.9C222.6 337.6 233.4 326.9 246.6 326.9C275.9 326.9 290.5 291.5 269.8 270.8C260.5 261.4 260.5 246.2 269.8 236.9C279.2 227.5 294.4 227.5 303.8 236.9C324.5 257.6 359.8 242.9 359.8 213.7C359.8 200.4 370.6 189.7 383.8 189.7H383.8zM352 352C369.7 352 384 337.7 384 320C384 302.3 369.7 288 352 288C334.3 288 320 302.3 320 320C320 337.7 334.3 352 352 352zM416 360C402.7 360 392 370.7 392 384C392 397.3 402.7 408 416 408C429.3 408 440 397.3 440 384C440 370.7 429.3 360 416 360z"/></svg>"""
		else -> null
	}
	
}
