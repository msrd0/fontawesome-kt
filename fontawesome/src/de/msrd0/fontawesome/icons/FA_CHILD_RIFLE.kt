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

object FA_CHILD_RIFLE: Icon {
	
	override val name get() = "Child Rifle"
	
	override val unicode get() = "e4e0"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M79.1 64C79.1 28.65 108.7 .0003 143.1 .0003C179.3 .0003 207.1 28.65 207.1 64C207.1 99.35 179.3 128 143.1 128C108.7 128 79.1 99.35 79.1 64V64zM104 512C86.33 512 72 497.7 72 480V300.5L59.09 321C49.67 336 29.91 340.5 14.96 331.1C.0006 321.7-4.492 301.9 4.923 286.1L56.6 204.9C74.17 176.9 104.9 160 137.8 160H150.2C183.2 160 213.8 176.9 231.4 204.9L283.1 286.1C292.5 301.9 288 321.7 273 331.1C258.1 340.5 238.3 336 228.9 321L216 300.5V480C216 497.7 201.7 512 184 512C166.3 512 152 497.7 152 480V352H136V480C136 497.7 121.7 512 104 512V512zM432 16V132.3C441.6 137.8 448 148.2 448 160V269.3L464 264V208C464 199.2 471.2 192 480 192H496C504.8 192 512 199.2 512 208V292.5C512 299.4 507.6 305.5 501.1 307.6L448 325.3V352H496C504.8 352 512 359.2 512 368V384C512 392.8 504.8 400 496 400H452L475 492.1C477.6 502.2 469.9 512 459.5 512H400C391.2 512 384 504.8 384 496V400H368C350.3 400 336 385.7 336 368V224C336 206.3 350.3 192 368 192V160C368 148.2 374.4 137.8 384 132.3V32C375.2 32 368 24.84 368 16C368 7.164 375.2 0 384 0H416C424.8 0 432 7.164 432 16V16z"/></svg>"""
		else -> null
	}
	
}
