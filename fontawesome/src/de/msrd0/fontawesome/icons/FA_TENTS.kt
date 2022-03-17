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

object FA_TENTS: Icon {
	
	override val name get() = "Tents"
	
	override val unicode get() = "e582"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M396.6 6.546C408.1-2.182 423.9-2.182 435.4 6.546L603.4 134.5C610 139.6 614.4 147 615.6 155.3L639.6 315.3C641 324.5 638.3 333.8 632.2 340.9C626.2 347.9 617.3 352 608 352H461.5L455.3 310.5C452.8 294 444 279.2 430.8 269.1L262.8 141.1C254.6 134.9 245.4 130.9 235.8 129.1L396.6 6.546zM411.4 294.5C418 299.6 422.4 307 423.6 315.3L447.6 475.3C449 484.5 446.3 493.8 440.2 500.9C434.2 507.9 425.3 512 416 512H319.1L223.1 352V512H32C22.68 512 13.83 507.9 7.753 500.9C1.674 493.8-1.028 484.5 .3542 475.3L24.35 315.3C25.59 307 29.98 299.6 36.61 294.5L204.6 166.5C216.1 157.8 231.9 157.8 243.4 166.5L411.4 294.5z"/></svg>"""
		else -> null
	}
	
}
