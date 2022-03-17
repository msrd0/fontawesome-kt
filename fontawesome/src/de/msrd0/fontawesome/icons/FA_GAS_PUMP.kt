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

object FA_GAS_PUMP: Icon {
	
	override val name get() = "Gas Pump"
	
	override val unicode get() = "f52f"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M32 64C32 28.65 60.65 0 96 0H256C291.3 0 320 28.65 320 64V256H328C376.6 256 416 295.4 416 344V376C416 389.3 426.7 400 440 400C453.3 400 464 389.3 464 376V221.1C436.4 214.9 416 189.8 416 160V96L384 64C375.2 55.16 375.2 40.84 384 32C392.8 23.16 407.2 23.16 416 32L493.3 109.3C505.3 121.3 512 137.5 512 154.5V376C512 415.8 479.8 448 440 448C400.2 448 368 415.8 368 376V344C368 321.9 350.1 303.1 328 303.1H320V448C337.7 448 352 462.3 352 480C352 497.7 337.7 512 320 512H32C14.33 512 0 497.7 0 480C0 462.3 14.33 448 32 448V64zM96 176C96 184.8 103.2 192 112 192H240C248.8 192 256 184.8 256 176V80C256 71.16 248.8 64 240 64H112C103.2 64 96 71.16 96 80V176z"/></svg>"""
		else -> null
	}
	
}
