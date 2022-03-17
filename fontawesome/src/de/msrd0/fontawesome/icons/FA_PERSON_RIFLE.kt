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

/** Person Rifle */
object FA_PERSON_RIFLE: Icon {
	
	override val name get() = "Person Rifle"
	
	override val unicode get() = "e54e"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M265.2 192C290.6 192 315 199.1 336 211.9V512H144V337.7L90.44 428.3C79.21 447.4 54.68 453.7 35.66 442.4C16.64 431.2 10.33 406.7 21.57 387.7L97.7 258.8C122.2 217.4 166.7 192 214.8 192L265.2 192zM320 80C320 124.2 284.2 160 240 160C195.8 160 160 124.2 160 80C160 35.82 195.8 .0003 240 .0003C284.2 .0003 320 35.82 320 80zM464 16V132.3C473.6 137.8 480 148.2 480 160V269.3L496 264V208C496 199.2 503.2 192 512 192H528C536.8 192 544 199.2 544 208V292.5C544 299.4 539.6 305.5 533.1 307.6L480 325.3V352H528C536.8 352 544 359.2 544 368V384C544 392.8 536.8 400 528 400H484L507 492.1C509.6 502.2 501.9 512 491.5 512H432C423.2 512 416 504.8 416 496V400H400C382.3 400 368 385.7 368 368V224C368 206.3 382.3 192 400 192V160C400 148.2 406.4 137.8 416 132.3V32C407.2 32 400 24.84 400 16C400 7.164 407.2 0 416 0H448C456.8 0 464 7.164 464 16V16z"/></svg>"""
		else -> null
	}
	
}
