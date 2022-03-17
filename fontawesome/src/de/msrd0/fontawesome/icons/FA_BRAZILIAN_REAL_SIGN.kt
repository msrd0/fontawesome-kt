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

object FA_BRAZILIAN_REAL_SIGN: Icon {
	
	override val name get() = "Brazilian Real Sign"
	
	override val unicode get() = "e46c"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M400 .0003C417.7 .0003 432 14.33 432 32V50.22C444.5 52.52 456.7 56.57 468.2 62.3L478.3 67.38C494.1 75.28 500.5 94.5 492.6 110.3C484.7 126.1 465.5 132.5 449.7 124.6L439.5 119.5C429.6 114.6 418.7 112 407.6 112H405.9C376.1 112 352 136.1 352 165.9C352 187.9 365.4 207.7 385.9 215.9L437.9 236.7C482.7 254.6 512 297.9 512 346.1V349.5C512 400.7 478.4 444.1 432 458.7V480C432 497.7 417.7 512 400 512C382.3 512 368 497.7 368 480V460.6C352.1 457.1 338.6 450.9 325.7 442.3L302.2 426.6C287.5 416.8 283.6 396.1 293.4 382.2C303.2 367.5 323 363.6 337.8 373.4L361.2 389C371.9 396.2 384.6 400 397.5 400C425.4 400 448 377.4 448 349.5V346.1C448 324.1 434.6 304.3 414.1 296.1L362.1 275.3C317.3 257.4 288 214.1 288 165.9C288 114 321.5 69.99 368 54.21V32C368 14.33 382.3 0 400 0L400 .0003zM.0003 64C.0003 46.33 14.33 32 32 32H112C191.5 32 256 96.47 256 176C256 234.8 220.8 285.3 170.3 307.7L221.7 436.1C228.3 452.5 220.3 471.1 203.9 477.7C187.5 484.3 168.9 476.3 162.3 459.9L106.3 320H64V448C64 465.7 49.67 480 32 480C14.33 480 0 465.7 0 448L.0003 64zM64 256H112C156.2 256 192 220.2 192 176C192 131.8 156.2 96 112 96H64V256z"/></svg>"""
		else -> null
	}
	
}
