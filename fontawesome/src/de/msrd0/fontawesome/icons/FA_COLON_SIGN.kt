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

/** Colon Sign */
object FA_COLON_SIGN: Icon {
	
	override val name get() = "Colon Sign"
	
	override val unicode get() = "e140"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M216.6 65.56C226.4 66.81 235.9 68.8 245.2 71.46L256.1 24.24C261.2 7.093 278.6-3.331 295.8 .9552C312.9 5.242 323.3 22.62 319 39.76L303.1 100C305.1 100.8 306.2 101.6 307.2 102.4C321.4 113 324.2 133.1 313.6 147.2C307.5 155.3 298.4 159.7 288.1 159.1L234.8 376.7C247.1 372.3 258.5 366.1 268.8 358.4C282.9 347.8 302.1 350.6 313.6 364.8C324.2 378.9 321.4 398.1 307.2 409.6C281.5 428.9 250.8 441.9 217.4 446.3L207 487.8C202.8 504.9 185.4 515.3 168.2 511C151.1 506.8 140.7 489.4 144.1 472.2L152.1 443.8C142.4 441.8 133.1 439.1 124.1 435.6L111 487.8C106.8 504.9 89.38 515.3 72.24 511C55.09 506.8 44.67 489.4 48.96 472.2L66.65 401.4C25.84 366.2 0 314.1 0 256C0 164.4 64.09 87.85 149.9 68.64L160.1 24.24C165.2 7.093 182.6-3.331 199.8 .9552C216.9 5.242 227.3 22.62 223 39.76L216.6 65.56zM131.2 143.3C91.17 164.1 64 207.3 64 256C64 282.2 71.85 306.5 85.32 326.8L131.2 143.3zM167.6 381.7L229.6 133.6C220.4 130.8 210.8 128.1 200.9 128.3L139.8 372.9C148.6 376.8 157.9 379.8 167.6 381.7V381.7z"/></svg>"""
		else -> null
	}
	
}
