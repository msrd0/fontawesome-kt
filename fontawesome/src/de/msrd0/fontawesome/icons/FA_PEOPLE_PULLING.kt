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

object FA_PEOPLE_PULLING: Icon {
	
	override val name get() = "People Pulling"
	
	override val unicode get() = "e535"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M32 48C32 21.49 53.49 0 80 0C106.5 0 128 21.49 128 48C128 74.51 106.5 96 80 96C53.49 96 32 74.51 32 48V48zM118.3 128C130.1 128 143.5 130.5 155.2 135.4L289.3 191.2C302.6 171.1 320.1 156.6 342.7 146.9L353.7 142C374.5 132.8 396.1 128 419.7 128C464.3 128 504.5 154.8 521.6 195.9L536.1 232.7L558.3 243.4C574.1 251.3 580.5 270.5 572.6 286.3C564.7 302.1 545.5 308.5 529.7 300.6L503 287.3C492.7 282.1 484.6 273.4 480.2 262.8L470.6 239.8L451.3 305.3L500.8 359.4C506.2 365.3 510.1 372.4 512 380.2L535 472.2C539.3 489.4 528.9 506.8 511.8 511C494.6 515.3 477.2 504.9 472.1 487.8L450.9 399.6L380.3 322.5C365.5 306.4 359.1 283.9 365.6 262.8L382.5 199.3C381.6 199.7 380.6 200.1 379.7 200.5L368.7 205.4C353.4 212.2 341.4 224.6 335.2 240.1L333.7 243.9C328.6 256.7 316.1 264.4 303 263.1C299.2 263.9 295.4 263.1 291.7 261.5L173.3 212.2L231.2 473.1C235.1 490.3 224.2 507.4 206.9 511.2C189.7 515.1 172.6 504.2 168.8 486.9L138.8 352H123.1L143.6 474.7C146.5 492.2 134.7 508.7 117.3 511.6C99.83 514.5 83.34 502.7 80.44 485.3L56.35 340.8C50.48 347.6 41.75 352 32 352C14.33 352 0 337.7 0 319.1V191.1C0 156.7 28.65 127.1 64 127.1L118.3 128zM416 48C416 21.49 437.5 0 464 0C490.5 0 512 21.49 512 48C512 74.51 490.5 96 464 96C437.5 96 416 74.51 416 48V48zM356.7 344.2L397.4 388.6L382.9 424.8C380.5 430.9 376.9 436.4 372.3 440.9L310.6 502.6C298.1 515.1 277.9 515.1 265.4 502.6C252.9 490.1 252.9 469.9 265.4 457.4L324.7 398L349.7 335.6C351.8 338.6 354.2 341.4 356.7 344.2H356.7z"/></svg>"""
		else -> null
	}
	
}
